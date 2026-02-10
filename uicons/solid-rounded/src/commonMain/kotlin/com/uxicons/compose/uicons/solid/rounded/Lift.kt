package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lift: ImageVector? = null

val Icons.Sr.Lift: ImageVector
    get() = _Lift ?: UXIcon(name = "Lift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.36f, 16.64f)
                lineToRelative(-2.09f, -2.09f)
                curveToRelative(-0.57f, -0.57f, -0.17f, -1.54f, 0.64f, -1.54f)
                horizontalLineToRelative(4.19f)
                curveToRelative(0.81f, 0f, 1.21f, 0.97f, 0.64f, 1.54f)
                lineToRelative(-2.09f, 2.09f)
                curveToRelative(-0.35f, 0.35f, -0.93f, 0.35f, -1.28f, 0f)
                close()
                moveTo(20.36f, 7.36f)
                lineTo(18.27f, 9.46f)
                curveToRelative(-0.57f, 0.57f, -0.17f, 1.54f, 0.64f, 1.54f)
                horizontalLineToRelative(4.19f)
                curveToRelative(0.81f, 0f, 1.21f, -0.97f, 0.64f, -1.54f)
                lineToRelative(-2.09f, -2.09f)
                curveToRelative(-0.35f, -0.35f, -0.93f, -0.35f, -1.28f, 0f)
                close()
                moveTo(9f, 0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                close()
                moveTo(18.95f, 5.95f)
                curveToRelative(0.31f, -0.31f, 0.67f, -0.52f, 1.05f, -0.66f)
                verticalLineToRelative(-0.28f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-0.28f)
                curveToRelative(-0.38f, -0.14f, -0.75f, -0.36f, -1.05f, -0.66f)
                lineToRelative(-2.09f, -2.09f)
                curveToRelative(-0.83f, -0.83f, -1.08f, -2.08f, -0.63f, -3.17f)
                curveToRelative(0.12f, -0.3f, 0.29f, -0.56f, 0.5f, -0.79f)
                curveToRelative(-0.2f, -0.23f, -0.37f, -0.5f, -0.5f, -0.79f)
                curveToRelative(-0.45f, -1.09f, -0.2f, -2.33f, 0.63f, -3.17f)
                lineToRelative(2.09f, -2.09f)
                close()
            }
        }.also { _Lift = it}
