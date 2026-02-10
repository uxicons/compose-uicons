package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenImage: ImageVector? = null

val Icons.Ts.BrokenImage: ImageVector
    get() = _BrokenImage ?: UXIcon(name = "BrokenImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(4.5f, 1f)
                lineTo(14f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(8.13f)
                lineToRelative(-4.57f, -4.57f)
                lineToRelative(-4.43f, 4.43f)
                lineToRelative(-4.43f, -4.43f)
                lineToRelative(-4.57f, 4.57f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 23f)
                verticalLineToRelative(-5.45f)
                lineToRelative(4.57f, -4.57f)
                lineToRelative(4.43f, 4.43f)
                lineToRelative(4.43f, -4.43f)
                lineToRelative(4.57f, 4.57f)
                verticalLineToRelative(5.46f)
                lineTo(3f, 23.01f)
                close()
            }
        }.also { _BrokenImage = it}
