package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crown: ImageVector? = null

val Icons.Tr.Crown: ImageVector
    get() = _Crown ?: UXIcon(name = "Crown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 5.12f)
                curveToRelative(-0.75f, -0.31f, -1.6f, -0.14f, -2.19f, 0.44f)
                lineToRelative(-3.04f, 3.19f)
                lineTo(13.41f, 3.58f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.87f, 0.04f)
                lineToRelative(-4.08f, 5.12f)
                lineToRelative(-3.05f, -3.16f)
                curveToRelative(-0.57f, -0.56f, -1.44f, -0.74f, -2.18f, -0.43f)
                curveTo(0.48f, 5.46f, 0f, 6.19f, 0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 6.96f)
                curveToRelative(0f, -0.81f, -0.48f, -1.54f, -1.24f, -1.85f)
                close()
                moveTo(23f, 17f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(5f, 21f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 7.0f)
                curveToRelative(-0.03f, -0.86f, 1.11f, -1.34f, 1.7f, -0.71f)
                lineToRelative(3.44f, 3.56f)
                curveToRelative(0.2f, 0.23f, 0.57f, 0.19f, 0.75f, -0.04f)
                lineToRelative(4.4f, -5.52f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.38f, -0.04f)
                lineToRelative(4.44f, 5.56f)
                curveToRelative(0.18f, 0.23f, 0.56f, 0.26f, 0.75f, 0.03f)
                lineToRelative(3.43f, -3.59f)
                curveToRelative(0.59f, -0.63f, 1.74f, -0.16f, 1.71f, 0.71f)
                verticalLineToRelative(10.04f)
                close()
            }
        }.also { _Crown = it}
