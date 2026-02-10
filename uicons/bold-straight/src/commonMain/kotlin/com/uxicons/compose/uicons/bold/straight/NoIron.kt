package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoIron: ImageVector? = null

val Icons.Bs.NoIron: ImageVector
    get() = _NoIron ?: UXIcon(name = "NoIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.05f, 20f)
                lineToRelative(3f, 3f)
                lineTo(0f, 23f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -3.05f, 1.37f, -7.73f, 5.91f, -9.64f)
                lineToRelative(2.37f, 2.37f)
                curveToRelative(-4.45f, 1.02f, -5.17f, 5.1f, -5.27f, 6.76f)
                lineTo(15.05f, 20f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(14.3f)
                lineToRelative(-2.16f, 2.16f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineTo(12.12f, 10f)
                horizontalLineToRelative(8.88f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(8f, 4f)
                lineTo(8f, 1f)
                horizontalLineToRelative(9.5f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(21f, 13f)
                horizontalLineToRelative(-5.88f)
                lineToRelative(5.88f, 5.88f)
                verticalLineToRelative(-5.88f)
                close()
            }
        }.also { _NoIron = it}
