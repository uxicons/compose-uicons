package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Tr.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.75f, 23f)
                horizontalLineTo(5.73f)
                curveTo(2.76f, 23f, 0.25f, 20.79f, 0.02f, 17.96f)
                curveToRelative(-0.14f, -1.77f, 0.58f, -3.52f, 1.94f, -4.66f)
                curveToRelative(0.51f, -0.43f, 0.71f, -1.07f, 0.51f, -1.64f)
                curveToRelative(-0.51f, -1.43f, -0.6f, -2.99f, -0.25f, -4.52f)
                curveToRelative(0.71f, -3.12f, 3.33f, -5.55f, 6.5f, -6.04f)
                curveToRelative(3.9f, -0.61f, 7.62f, 1.64f, 8.87f, 5.35f)
                curveToRelative(0.16f, 0.46f, 0.51f, 0.82f, 0.98f, 0.97f)
                curveToRelative(3.54f, 1.2f, 5.77f, 4.64f, 5.4f, 8.37f)
                curveToRelative(-0.39f, 4.04f, -4.0f, 7.2f, -8.21f, 7.2f)
                close()
                moveTo(9.98f, 2.0f)
                curveToRelative(-0.37f, 0f, -0.74f, 0.03f, -1.12f, 0.09f)
                curveToRelative(-2.77f, 0.43f, -5.05f, 2.56f, -5.67f, 5.28f)
                curveToRelative(-0.31f, 1.34f, -0.23f, 2.71f, 0.21f, 3.96f)
                curveToRelative(0.34f, 0.96f, 0.03f, 2.04f, -0.8f, 2.74f)
                curveToRelative(-1.13f, 0.95f, -1.7f, 2.34f, -1.58f, 3.82f)
                curveToRelative(0.19f, 2.31f, 2.26f, 4.12f, 4.71f, 4.12f)
                horizontalLineTo(15.75f)
                curveToRelative(3.71f, 0f, 6.88f, -2.77f, 7.22f, -6.3f)
                curveToRelative(0.32f, -3.27f, -1.63f, -6.28f, -4.73f, -7.33f)
                curveToRelative(-0.77f, -0.26f, -1.35f, -0.84f, -1.61f, -1.6f)
                curveToRelative(-0.97f, -2.89f, -3.67f, -4.77f, -6.65f, -4.77f)
                close()
            }
        }.also { _Cloud = it}
