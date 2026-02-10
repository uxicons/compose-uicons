package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SushiRoll: ImageVector? = null

val Icons.Ss.SushiRoll: ImageVector
    get() = _SushiRoll ?: UXIcon(name = "SushiRoll") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.01f)
                verticalLineToRelative(7.49f)
                curveToRelative(0f, 3.77f, -5.05f, 6.5f, -12f, 6.5f)
                reflectiveCurveTo(0f, 21.27f, 0f, 17.5f)
                verticalLineToRelative(-7.49f)
                curveToRelative(2.41f, 2.43f, 6.79f, 3.99f, 12f, 3.99f)
                reflectiveCurveToRelative(9.59f, -1.56f, 12f, -3.99f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, 3.37f, -5.27f, 6f, -12f, 6f)
                reflectiveCurveTo(0f, 9.37f, 0f, 6f)
                reflectiveCurveTo(5.27f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 2.63f, 12f, 6f)
                close()
                moveTo(18.71f, 5.49f)
                curveToRelative(-1.14f, -0.68f, -3.44f, -1.49f, -6.71f, -1.49f)
                reflectiveCurveToRelative(-5.57f, 0.81f, -6.71f, 1.49f)
                curveToRelative(-0.39f, 0.23f, -0.39f, 0.79f, 0f, 1.02f)
                curveToRelative(1.14f, 0.68f, 3.44f, 1.49f, 6.71f, 1.49f)
                reflectiveCurveToRelative(5.57f, -0.81f, 6.71f, -1.49f)
                curveToRelative(0.39f, -0.23f, 0.39f, -0.79f, 0f, -1.02f)
                close()
            }
        }.also { _SushiRoll = it}
