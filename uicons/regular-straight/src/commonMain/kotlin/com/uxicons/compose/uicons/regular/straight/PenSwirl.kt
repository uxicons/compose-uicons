package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Rs.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 4.31f, -3.5f, 7.81f, -7.81f, 7.81f)
                reflectiveCurveToRelative(-7.81f, -3.5f, -7.81f, -7.81f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 3.2f, 2.61f, 5.81f, 5.81f, 5.81f)
                reflectiveCurveToRelative(5.81f, -2.61f, 5.81f, -5.81f)
                curveToRelative(0f, -0.89f, -0.13f, -1.75f, -0.35f, -2.58f)
                lineToRelative(1.59f, -1.59f)
                curveToRelative(0.48f, 1.3f, 0.76f, 2.7f, 0.76f, 4.17f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(0.89f, 0f, 1.75f, 0.13f, 2.58f, 0.35f)
                lineToRelative(1.59f, -1.59f)
                curveToRelative(-1.3f, -0.48f, -2.7f, -0.76f, -4.17f, -0.76f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 4.96f, 2.67f, 9.29f, 7.32f, 11.87f)
                lineToRelative(0.97f, -1.75f)
                curveToRelative(-4.0f, -2.22f, -6.29f, -5.91f, -6.29f, -10.13f)
                close()
                moveTo(12f, 7.76f)
                lineTo(18.88f, 0.88f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(-6.88f, 6.88f)
                horizontalLineToRelative(-4.24f)
                verticalLineToRelative(-4.24f)
                close()
                moveTo(14f, 10f)
                horizontalLineToRelative(1.42f)
                lineToRelative(6.29f, -6.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0f)
                lineToRelative(-6.29f, 6.29f)
                verticalLineToRelative(1.41f)
                close()
            }
        }.also { _PenSwirl = it}
