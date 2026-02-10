package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneFlip: ImageVector? = null

val Icons.Ts.PhoneFlip: ImageVector
    get() = _PhoneFlip ?: UXIcon(name = "PhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.35f, 3.05f)
                lineTo(19.39f, 0.09f)
                lineToRelative(-5.84f, 5.84f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(-1.54f, 3.64f, -4.1f, 6.2f, -7.62f, 7.63f)
                lineToRelative(-3.48f, -3.48f)
                lineTo(0.09f, 19.39f)
                lineToRelative(2.96f, 2.96f)
                curveToRelative(1.06f, 1.06f, 2.5f, 1.65f, 4.05f, 1.65f)
                curveToRelative(7.42f, 0f, 16.89f, -9.47f, 16.89f, -16.89f)
                curveToRelative(0f, -1.55f, -0.59f, -2.99f, -1.65f, -4.06f)
                close()
                moveTo(7.11f, 23f)
                curveToRelative(-1.29f, 0f, -2.47f, -0.48f, -3.35f, -1.36f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(4.42f, -4.42f)
                lineToRelative(3.23f, 3.23f)
                lineToRelative(0.3f, -0.12f)
                curveToRelative(4.04f, -1.54f, 6.94f, -4.44f, 8.61f, -8.61f)
                lineToRelative(0.12f, -0.31f)
                lineToRelative(-3.24f, -3.24f)
                lineTo(19.39f, 1.51f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(0.88f, 0.87f, 1.36f, 2.06f, 1.36f, 3.35f)
                curveToRelative(0f, 6.83f, -9.06f, 15.89f, -15.89f, 15.89f)
                close()
            }
        }.also { _PhoneFlip = it}
