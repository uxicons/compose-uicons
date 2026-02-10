package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Ts.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.69f, 5.24f)
                curveToRelative(1.43f, -0.83f, 3.33f, -2.38f, 3.33f, -4.74f)
                lineTo(17.02f, 0f)
                lineTo(7.03f, 0f)
                lineTo(7.03f, 0.5f)
                curveToRelative(0f, 2.36f, 1.88f, 3.9f, 3.29f, 4.73f)
                curveTo(5.32f, 6.5f, 1f, 13.04f, 1f, 18.25f)
                curveToRelative(0f, 3.17f, 2.58f, 5.75f, 5.75f, 5.75f)
                horizontalLineToRelative(10.5f)
                curveToRelative(3.17f, 0f, 5.75f, -2.58f, 5.75f, -5.75f)
                curveToRelative(0f, -5.2f, -4.32f, -11.75f, -9.31f, -13.01f)
                close()
                moveTo(8.06f, 1f)
                horizontalLineToRelative(7.92f)
                curveToRelative(-0.37f, 2.32f, -3.25f, 3.66f, -3.98f, 3.96f)
                curveToRelative(-0.73f, -0.31f, -3.57f, -1.64f, -3.94f, -3.96f)
                close()
                moveTo(17.25f, 23f)
                lineTo(6.75f, 23f)
                curveToRelative(-2.62f, 0f, -4.75f, -2.13f, -4.75f, -4.75f)
                curveToRelative(0f, -5.32f, 4.88f, -12.19f, 10f, -12.25f)
                curveToRelative(5.12f, 0.06f, 10f, 6.93f, 10f, 12.25f)
                curveToRelative(0f, 2.62f, -2.13f, 4.75f, -4.75f, 4.75f)
                close()
            }
        }.also { _Sack = it}
