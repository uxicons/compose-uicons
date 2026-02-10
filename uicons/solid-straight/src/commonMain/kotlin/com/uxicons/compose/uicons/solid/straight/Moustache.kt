package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moustache: ImageVector? = null

val Icons.Ss.Moustache: ImageVector
    get() = _Moustache ?: UXIcon(name = "Moustache") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 17f)
                curveToRelative(-2.87f, 0f, -4.58f, -1.23f, -5.5f, -2.25f)
                curveToRelative(-0.92f, 1.02f, -2.63f, 2.25f, -5.5f, 2.25f)
                curveToRelative(-2.76f, 0f, -4.87f, -2.47f, -5.83f, -4.58f)
                lineTo(0.02f, 11f)
                horizontalLineTo(1.58f)
                curveToRelative(1.71f, 0f, 2.15f, -0.41f, 3.13f, -1.31f)
                curveToRelative(0.4f, -0.36f, 0.85f, -0.78f, 1.45f, -1.24f)
                curveToRelative(1.19f, -0.9f, 2.02f, -1.45f, 3.56f, -1.45f)
                curveToRelative(0.92f, 0f, 1.74f, 0.4f, 2.28f, 0.75f)
                curveToRelative(0.55f, -0.35f, 1.36f, -0.75f, 2.28f, -0.75f)
                curveToRelative(1.53f, 0f, 2.37f, 0.55f, 3.56f, 1.45f)
                horizontalLineToRelative(0f)
                curveToRelative(0.6f, 0.46f, 1.05f, 0.87f, 1.45f, 1.24f)
                curveToRelative(0.98f, 0.9f, 1.43f, 1.31f, 3.13f, 1.31f)
                horizontalLineToRelative(1.55f)
                lineToRelative(-0.64f, 1.42f)
                curveToRelative(-0.96f, 2.12f, -3.07f, 4.58f, -5.83f, 4.58f)
                close()
            }
        }.also { _Moustache = it}
