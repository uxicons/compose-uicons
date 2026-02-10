package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbExclamation: ImageVector? = null

val Icons.Sr.LightbulbExclamation: ImageVector
    get() = _LightbulbExclamation ?: UXIcon(name = "LightbulbExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 20.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(0.31f)
                curveToRelative(0f, 2.04f, -1.66f, 3.69f, -3.69f, 3.69f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-2.04f, 0f, -3.69f, -1.66f, -3.69f, -3.69f)
                verticalLineToRelative(-0.31f)
                close()
                moveTo(21f, 9.0f)
                curveToRelative(0f, 2.59f, -1.12f, 5.05f, -3.07f, 6.76f)
                curveToRelative(-0.74f, 0.65f, -1.27f, 1.41f, -1.59f, 2.24f)
                lineTo(7.56f, 18.0f)
                curveToRelative(-0.36f, -0.88f, -0.93f, -1.7f, -1.7f, -2.42f)
                curveToRelative(-2.15f, -2.0f, -3.17f, -4.83f, -2.79f, -7.76f)
                curveTo(3.59f, 3.78f, 6.9f, 0.52f, 10.96f, 0.06f)
                curveToRelative(2.57f, -0.29f, 5.13f, 0.52f, 7.04f, 2.23f)
                curveToRelative(1.91f, 1.71f, 3.01f, 4.15f, 3.01f, 6.71f)
                close()
                moveTo(11f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                close()
                moveTo(13.5f, 13.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _LightbulbExclamation = it}
