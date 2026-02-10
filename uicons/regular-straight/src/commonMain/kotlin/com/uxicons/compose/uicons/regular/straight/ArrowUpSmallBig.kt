package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSmallBig: ImageVector? = null

val Icons.Rs.ArrowUpSmallBig: ImageVector
    get() = _ArrowUpSmallBig ?: UXIcon(name = "ArrowUpSmallBig") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.37f, 0.59f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(6.96f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(4.96f, 3f)
                lineTo(1.46f, 6.5f)
                lineTo(0.04f, 5.09f)
                lineTo(4.54f, 0.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                close()
                moveTo(23.96f, 1f)
                lineTo(23.96f, 9f)
                lineTo(15.96f, 9f)
                lineTo(15.96f, 1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(21.96f, 3f)
                horizontalLineToRelative(-4f)
                lineTo(17.96f, 7f)
                horizontalLineToRelative(4f)
                lineTo(21.96f, 3f)
                close()
                moveTo(13.96f, 13f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                lineTo(13.96f, 23f)
                lineTo(13.96f, 13f)
                close()
                moveTo(15.96f, 21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ArrowUpSmallBig = it}
