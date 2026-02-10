package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Rs.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(14.14f, 19.11f)
                lineToRelative(9.82f, -10.11f)
                horizontalLineToRelative(-6.95f)
                lineTo(17.01f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 9f)
                lineTo(0.07f, 9f)
                lineToRelative(9.8f, 10.11f)
                horizontalLineToRelative(0f)
                curveToRelative(0.57f, 0.58f, 1.32f, 0.89f, 2.12f, 0.89f)
                horizontalLineToRelative(0f)
                curveToRelative(0.8f, 0f, 1.56f, -0.31f, 2.13f, -0.89f)
                close()
                moveTo(4.79f, 11f)
                horizontalLineToRelative(4.21f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 11f)
                horizontalLineToRelative(4.22f)
                lineToRelative(-6.51f, 6.71f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.1f, -0.7f, -0.29f)
                lineToRelative(-6.5f, -6.71f)
                close()
            }
        }.also { _DownToLine = it}
