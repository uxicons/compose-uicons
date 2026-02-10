package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationShapes: ImageVector? = null

val Icons.Rs.TransformationShapes: ImageVector
    get() = _TransformationShapes ?: UXIcon(name = "TransformationShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 0f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveTo(10.08f, 0f, 6.5f, 0f)
                close()
                moveTo(6.5f, 11f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveTo(4.02f, 2f, 6.5f, 2f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(12f, 24f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(12f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-8f)
                close()
                moveTo(8.42f, 18.59f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(-2.51f, 2.51f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.01f)
                lineToRelative(-1.51f, -1.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.51f, 2.51f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.01f)
                lineToRelative(1.51f, 1.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.51f, -2.51f)
                curveToRelative(-0.77f, -0.78f, -0.77f, -2.04f, 0f, -2.81f)
                lineTo(18.09f, 0.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _TransformationShapes = it}
