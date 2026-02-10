package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wrap: ImageVector? = null

val Icons.Bs.Wrap: ImageVector
    get() = _Wrap ?: UXIcon(name = "Wrap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                lineToRelative(1.11f, 15f)
                horizontalLineToRelative(15.79f)
                lineToRelative(1.11f, -15f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(6.13f, 10.75f)
                curveToRelative(0.93f, 0.25f, 2.27f, 0.72f, 3.71f, 1.6f)
                curveToRelative(-1.18f, 1.16f, -2.31f, 2.6f, -3.27f, 4.38f)
                close()
                moveTo(17.11f, 21f)
                horizontalLineToRelative(-9.12f)
                curveToRelative(2.32f, -6.9f, 7.21f, -9.3f, 9.87f, -10.11f)
                lineToRelative(-0.75f, 10.11f)
                close()
                moveTo(16.7f, 8.15f)
                curveToRelative(-0.39f, -0.68f, -1.11f, -1.15f, -1.95f, -1.15f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0f, 0.3f, 0.06f, 0.58f, 0.17f, 0.84f)
                curveToRelative(-0.13f, 0.08f, -0.26f, 0.17f, -0.39f, 0.26f)
                curveToRelative(-0.6f, -0.41f, -1.78f, -1.09f, -1.78f, -1.1f)
                curveToRelative(0f, -1.48f, 0.76f, -2.78f, 1.91f, -3.54f)
                curveToRelative(-0.52f, -0.43f, -1.18f, -0.7f, -1.91f, -0.7f)
                curveToRelative(-1.66f, 0f, -3.0f, 1.38f, -3.0f, 3.03f)
                curveToRelative(-0.53f, -0.16f, -0.98f, -0.28f, -1.35f, -0.35f)
                curveToRelative(0.6f, -2.67f, 3.0f, -4.68f, 5.85f, -4.68f)
                curveToRelative(2.9f, 0f, 5.32f, 2.06f, 5.88f, 4.8f)
                curveToRelative(-0.34f, 0.09f, -0.74f, 0.2f, -1.18f, 0.35f)
                close()
            }
        }.also { _Wrap = it}
