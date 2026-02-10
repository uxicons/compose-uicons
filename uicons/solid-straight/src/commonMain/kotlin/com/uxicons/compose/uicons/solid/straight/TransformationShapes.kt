package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationShapes: ImageVector? = null

val Icons.Ss.TransformationShapes: ImageVector
    get() = _TransformationShapes ?: UXIcon(name = "TransformationShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 0f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveTo(10.08f, 0f, 6.5f, 0f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(11f)
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
