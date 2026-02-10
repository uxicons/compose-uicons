package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationShapes: ImageVector? = null

val Icons.Ts.TransformationShapes: ImageVector
    get() = _TransformationShapes ?: UXIcon(name = "TransformationShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 0f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(9.31f, 0f, 6f, 0f)
                close()
                moveTo(6f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(3.24f, 1f, 6f, 1f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(11f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-9f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.19f)
                lineToRelative(2.27f, 2.27f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.44f, -2.44f)
                curveToRelative(-0.57f, -0.57f, -0.57f, -1.5f, 0f, -2.07f)
                lineTo(17.87f, 0.03f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.27f, 2.27f)
                horizontalLineToRelative(5.19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(8.57f, 19.47f)
                curveToRelative(0.57f, 0.57f, 0.57f, 1.5f, 0f, 2.07f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.27f, -2.27f)
                lineTo(2.5f, 21.0f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.19f)
                lineToRelative(-2.27f, -2.27f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.44f, 2.44f)
                close()
            }
        }.also { _TransformationShapes = it}
