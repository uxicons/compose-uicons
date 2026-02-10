package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceAlt: ImageVector? = null

val Icons.Ts.DiceAlt: ImageVector
    get() = _DiceAlt ?: UXIcon(name = "DiceAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 9f)
                lineTo(11.5f, 9f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(15f)
                lineTo(24f, 11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(10f, 23f)
                lineTo(10f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.5f)
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
                moveTo(10.71f, 5.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
                moveTo(6.71f, 9.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
                moveTo(8.54f, 1.47f)
                lineTo(1.47f, 8.54f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(5.53f, 5.53f)
                verticalLineToRelative(1.41f)
                lineTo(0.76f, 11.37f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0f, -3.54f)
                lineTo(7.83f, 0.76f)
                curveToRelative(0.94f, -0.94f, 2.59f, -0.94f, 3.54f, 0f)
                lineToRelative(6.24f, 6.24f)
                horizontalLineToRelative(-1.41f)
                lineTo(10.66f, 1.47f)
                curveToRelative(-0.57f, -0.57f, -1.55f, -0.57f, -2.12f, 0f)
                close()
            }
        }.also { _DiceAlt = it}
