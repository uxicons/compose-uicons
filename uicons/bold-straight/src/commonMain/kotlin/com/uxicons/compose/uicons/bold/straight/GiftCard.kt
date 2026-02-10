package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GiftCard: ImageVector? = null

val Icons.Bs.GiftCard: ImageVector
    get() = _GiftCard ?: UXIcon(name = "GiftCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 5f)
                horizontalLineToRelative(-2.58f)
                curveToRelative(1.2f, -1.18f, 1.44f, -2.66f, 0.52f, -3.88f)
                curveToRelative(-0.93f, -1.24f, -2.68f, -1.49f, -3.92f, -0.56f)
                curveToRelative(-2.24f, 1.68f, -2.52f, 4.44f, -2.52f, 4.44f)
                curveToRelative(0f, 0f, -0.28f, -2.76f, -2.52f, -4.44f)
                curveToRelative(-1.24f, -0.93f, -2.99f, -0.68f, -3.92f, 0.56f)
                curveToRelative(-0.92f, 1.22f, -0.68f, 2.71f, 0.52f, 3.88f)
                lineTo(3.5f, 5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(24f, 24f)
                lineTo(24f, 8.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 8f)
                horizontalLineToRelative(6.66f)
                curveToRelative(-0.98f, 1.91f, -3.79f, 2.0f, -4.17f, 2f)
                lineToRelative(0.01f, 3f)
                curveToRelative(1.68f, 0f, 4.34f, -0.57f, 6f, -2.38f)
                curveToRelative(1.66f, 1.81f, 4.32f, 2.38f, 6f, 2.38f)
                verticalLineToRelative(-3f)
                curveToRelative(-0.15f, 0f, -3.14f, -0.03f, -4.16f, -2f)
                horizontalLineToRelative(6.66f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                lineTo(3f, 16f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-2f)
                lineTo(21f, 19f)
                verticalLineToRelative(2f)
                lineTo(3f, 21f)
                close()
            }
        }.also { _GiftCard = it}
