package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceAlt: ImageVector? = null

val Icons.Tr.DiceAlt: ImageVector
    get() = _DiceAlt ?: UXIcon(name = "DiceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 9f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6f)
                close()
                moveTo(15f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(5f, 8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(6.91f, 16.59f)
                curveToRelative(-0.1f, 0.14f, -0.25f, 0.22f, -0.41f, 0.22f)
                curveToRelative(-0.1f, 0f, -0.2f, -0.03f, -0.28f, -0.09f)
                curveToRelative(-0.23f, -0.16f, -0.45f, -0.34f, -0.64f, -0.53f)
                lineTo(1.33f, 11.94f)
                curveTo(-0.42f, 10.19f, -0.42f, 7.33f, 1.33f, 5.58f)
                lineTo(5.58f, 1.33f)
                curveTo(6.42f, 0.48f, 7.56f, 0.01f, 8.76f, 0.01f)
                reflectiveCurveToRelative(2.33f, 0.47f, 3.18f, 1.32f)
                lineToRelative(4.24f, 4.24f)
                curveToRelative(0.2f, 0.2f, 0.38f, 0.41f, 0.53f, 0.64f)
                curveToRelative(0.15f, 0.23f, 0.1f, 0.54f, -0.13f, 0.69f)
                curveToRelative(-0.23f, 0.15f, -0.54f, 0.1f, -0.69f, -0.13f)
                curveToRelative(-0.12f, -0.18f, -0.26f, -0.35f, -0.41f, -0.5f)
                lineTo(11.23f, 2.04f)
                curveToRelative(-1.32f, -1.32f, -3.63f, -1.32f, -4.95f, 0f)
                lineTo(2.04f, 6.28f)
                curveToRelative(-1.36f, 1.36f, -1.36f, 3.58f, 0f, 4.95f)
                lineToRelative(4.24f, 4.24f)
                curveToRelative(0.15f, 0.15f, 0.32f, 0.29f, 0.5f, 0.41f)
                curveToRelative(0.23f, 0.16f, 0.29f, 0.47f, 0.13f, 0.69f)
                close()
            }
        }.also { _DiceAlt = it}
