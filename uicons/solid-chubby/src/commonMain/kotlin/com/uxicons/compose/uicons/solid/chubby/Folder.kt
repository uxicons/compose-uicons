package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Folder: ImageVector? = null

val Icons.Sc.Folder: ImageVector
    get() = _Folder ?: UXIcon(name = "Folder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.09f, 7.93f)
                curveToRelative(4.62f, 0f, 8.56f, 0.62f, 10.71f, 1.04f)
                curveToRelative(-0.23f, -2.08f, -0.57f, -3.48f, -0.6f, -3.57f)
                curveToRelative(-0.1f, -0.38f, -0.4f, -0.67f, -0.79f, -0.74f)
                curveToRelative(-0.11f, -0.02f, -2.77f, -0.51f, -5.58f, -0.67f)
                curveToRelative(-2.15f, -0.12f, -3.91f, -0.13f, -4.84f, -0.12f)
                lineToRelative(-0.36f, -0.94f)
                curveToRelative(-0.11f, -0.29f, -0.35f, -0.51f, -0.64f, -0.6f)
                curveToRelative(-0.06f, -0.02f, -1.58f, -0.47f, -3.98f, -0.24f)
                curveToRelative(-2.28f, 0.22f, -3.29f, 0.8f, -3.4f, 0.86f)
                curveToRelative(-0.22f, 0.13f, -0.38f, 0.34f, -0.45f, 0.58f)
                curveToRelative(-0.04f, 0.13f, -0.69f, 2.46f, -1f, 5.44f)
                curveToRelative(2.17f, -0.42f, 6.22f, -1.05f, 10.93f, -1.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.09f, 9.93f)
                curveToRelative(-4.93f, 0f, -9.18f, 0.74f, -11.07f, 1.12f)
                curveToRelative(-0.01f, 0.28f, -0.01f, 0.55f, -0.01f, 0.83f)
                curveToRelative(0f, 4.44f, 1.11f, 8.2f, 1.16f, 8.36f)
                curveToRelative(0.1f, 0.34f, 0.37f, 0.59f, 0.71f, 0.68f)
                curveToRelative(0.17f, 0.04f, 4.1f, 1.04f, 9.13f, 1.04f)
                curveToRelative(5.06f, 0f, 9.08f, -1.0f, 9.25f, -1.04f)
                curveToRelative(0.33f, -0.08f, 0.6f, -0.33f, 0.7f, -0.65f)
                curveToRelative(0.04f, -0.13f, 1.04f, -3.17f, 1.04f, -7.66f)
                curveToRelative(0f, -0.54f, -0.01f, -1.07f, -0.04f, -1.57f)
                curveToRelative(-1.88f, -0.39f, -6.03f, -1.11f, -10.87f, -1.11f)
                close()
            }
        }.also { _Folder = it}
