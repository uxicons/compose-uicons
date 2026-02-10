package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Massage: ImageVector? = null

val Icons.Rs.Massage: ImageVector
    get() = _Massage ?: UXIcon(name = "Massage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 9f)
                curveToRelative(-2.2f, 0f, -4.26f, 0.6f, -6.04f, 1.63f)
                curveToRelative(-0.31f, -3.14f, -1.8f, -6.22f, -4.25f, -8.67f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-2.45f, 2.45f, -3.95f, 5.54f, -4.25f, 8.67f)
                curveToRelative(-1.77f, -1.04f, -3.84f, -1.63f, -6.04f, -1.63f)
                lineTo(0f, 9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 6.28f, 4.85f, 11.45f, 11f, 11.96f)
                lineToRelative(1f, 0.04f)
                lineToRelative(1f, -0.04f)
                curveToRelative(6.15f, -0.51f, 11f, -5.68f, 11f, -11.96f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12f, 4.13f)
                curveToRelative(2.02f, 2.34f, 3.08f, 5.1f, 3.02f, 7.92f)
                curveToRelative(-1.28f, 1.15f, -2.32f, 2.56f, -3.02f, 4.16f)
                curveToRelative(-0.7f, -1.6f, -1.73f, -3.01f, -3.02f, -4.16f)
                curveToRelative(-0.07f, -2.81f, 0.99f, -5.58f, 3.02f, -7.92f)
                close()
                moveTo(2.06f, 11.05f)
                curveToRelative(4.67f, 0.49f, 8.4f, 4.22f, 8.89f, 8.89f)
                curveToRelative(-4.67f, -0.49f, -8.4f, -4.22f, -8.89f, -8.89f)
                close()
                moveTo(13.05f, 19.95f)
                curveToRelative(0.49f, -4.67f, 4.22f, -8.4f, 8.89f, -8.89f)
                curveToRelative(-0.49f, 4.67f, -4.22f, 8.4f, -8.89f, 8.89f)
                close()
            }
        }.also { _Massage = it}
