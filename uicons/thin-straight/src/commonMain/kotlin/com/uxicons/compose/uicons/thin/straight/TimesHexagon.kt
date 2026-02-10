package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimesHexagon: ImageVector? = null

val Icons.Ts.TimesHexagon: ImageVector
    get() = _TimesHexagon ?: UXIcon(name = "TimesHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.69f, 10.74f)
                lineToRelative(-4.45f, -8.36f)
                curveToRelative(-0.45f, -0.85f, -1.33f, -1.38f, -2.29f, -1.38f)
                lineTo(7.07f, 1f)
                curveToRelative(-0.96f, 0f, -1.83f, 0.53f, -2.28f, 1.37f)
                lineTo(0.32f, 10.74f)
                curveToRelative(-0.42f, 0.79f, -0.42f, 1.74f, 0f, 2.54f)
                lineToRelative(4.47f, 8.36f)
                curveToRelative(0.45f, 0.85f, 1.33f, 1.37f, 2.28f, 1.37f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.96f, 0f, 1.83f, -0.53f, 2.29f, -1.38f)
                lineToRelative(4.45f, -8.36f)
                curveToRelative(0.42f, -0.79f, 0.42f, -1.74f, 0f, -2.52f)
                close()
                moveTo(22.8f, 12.79f)
                lineToRelative(-4.45f, 8.36f)
                curveToRelative(-0.28f, 0.52f, -0.81f, 0.85f, -1.4f, 0.85f)
                lineTo(7.07f, 22.0f)
                curveToRelative(-0.59f, 0f, -1.12f, -0.32f, -1.4f, -0.84f)
                lineTo(1.2f, 12.8f)
                curveToRelative(-0.27f, -0.5f, -0.27f, -1.09f, 0f, -1.59f)
                lineTo(5.67f, 2.84f)
                curveToRelative(0.28f, -0.52f, 0.81f, -0.84f, 1.4f, -0.84f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.59f, 0f, 1.12f, 0.32f, 1.4f, 0.85f)
                lineToRelative(4.45f, 8.36f)
                curveToRelative(0.26f, 0.5f, 0.26f, 1.09f, 0f, 1.59f)
                close()
                moveTo(16.05f, 8.64f)
                lineToRelative(-3.35f, 3.36f)
                lineToRelative(3.35f, 3.36f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.34f, -3.36f)
                lineToRelative(-3.34f, 3.36f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.35f, -3.36f)
                lineToRelative(-3.35f, -3.36f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.34f, 3.36f)
                lineToRelative(3.34f, -3.36f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _TimesHexagon = it}
