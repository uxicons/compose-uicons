package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Script: ImageVector? = null

val Icons.Tr.Script: ImageVector
    get() = _Script ?: UXIcon(name = "Script") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                lineTo(6f, 3f)
                curveToRelative(0f, -0.77f, -0.3f, -1.47f, -0.78f, -2f)
                horizontalLineToRelative(10.28f)
                curveToRelative(0.3f, 0f, 0.7f, 0.13f, 1f, 0.13f)
                curveToRelative(0.22f, 0f, 0.43f, -0.15f, 0.48f, -0.38f)
                curveToRelative(0.07f, -0.27f, -0.09f, -0.54f, -0.36f, -0.61f)
                curveToRelative(-0.36f, -0.09f, -0.74f, -0.14f, -1.12f, -0.14f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveTo(1.9f, 1f, 3f, 1f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 23f)
                horizontalLineToRelative(-10.77f)
                curveToRelative(0.48f, -0.53f, 0.77f, -1.23f, 0.77f, -2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 9.91f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.94f, 0f, 1.81f, -0.36f, 2.48f, -1.02f)
                lineToRelative(6.71f, -6.71f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                reflectiveCurveToRelative(-2.56f, -0.97f, -3.54f, 0f)
                lineToRelative(-6.71f, 6.71f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                close()
                moveTo(20.44f, 1.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                reflectiveCurveToRelative(0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(-6.71f, 6.71f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                horizontalLineToRelative(-1.09f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0f, -0.67f, 0.26f, -1.29f, 0.73f, -1.77f)
                lineToRelative(6.71f, -6.71f)
                close()
            }
        }.also { _Script = it}
