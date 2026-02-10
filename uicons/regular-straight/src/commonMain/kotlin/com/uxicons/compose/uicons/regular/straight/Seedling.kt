package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Seedling: ImageVector? = null

val Icons.Rs.Seedling: ImageVector
    get() = _Seedling ?: UXIcon(name = "Seedling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 0.94f)
                lineToRelative(-0.06f, -0.96f)
                lineToRelative(-0.96f, 0.01f)
                curveToRelative(-6.71f, 0.1f, -9.66f, 4.23f, -10.96f, 7.61f)
                curveTo(10.71f, 4.23f, 7.75f, 0.1f, 1.04f, 0f)
                lineTo(0.09f, -0.01f)
                lineTo(0.03f, 0.94f)
                curveToRelative(-0.22f, 3.8f, 0.75f, 6.79f, 2.87f, 8.89f)
                curveToRelative(2.63f, 2.6f, 6.3f, 3.08f, 8.1f, 3.15f)
                verticalLineToRelative(11.01f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.01f)
                curveToRelative(1.79f, -0.07f, 5.46f, -0.55f, 8.1f, -3.15f)
                curveToRelative(2.12f, -2.1f, 3.09f, -5.09f, 2.87f, -8.89f)
                close()
                moveTo(4.3f, 8.4f)
                curveToRelative(-1.51f, -1.5f, -2.29f, -3.64f, -2.3f, -6.35f)
                curveToRelative(6.84f, 0.62f, 8.49f, 6.48f, 8.88f, 8.93f)
                curveToRelative(-1.56f, -0.09f, -4.53f, -0.54f, -6.58f, -2.58f)
                close()
                moveTo(13.12f, 10.98f)
                curveToRelative(0.39f, -2.45f, 2.04f, -8.31f, 8.88f, -8.93f)
                curveToRelative(-0.02f, 2.72f, -0.79f, 4.85f, -2.3f, 6.35f)
                curveToRelative(-2.05f, 2.03f, -5.02f, 2.48f, -6.58f, 2.58f)
                close()
            }
        }.also { _Seedling = it}
