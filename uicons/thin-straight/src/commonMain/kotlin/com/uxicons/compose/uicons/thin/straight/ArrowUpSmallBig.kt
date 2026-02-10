package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSmallBig: ImageVector? = null

val Icons.Ts.ArrowUpSmallBig: ImageVector
    get() = _ArrowUpSmallBig ?: UXIcon(name = "ArrowUpSmallBig") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 1f)
                lineTo(16f, 9f)
                horizontalLineToRelative(8f)
                lineTo(24f, 1f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(23f, 8f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveTo(14f, 23f)
                horizontalLineToRelative(10f)
                lineTo(24f, 13f)
                lineTo(14f, 13f)
                verticalLineToRelative(10f)
                close()
                moveTo(15f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                lineTo(15f, 22f)
                lineTo(15f, 14f)
                close()
                moveTo(6.56f, 0.44f)
                lineToRelative(4.44f, 4.44f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(6f, 1.29f)
                lineTo(6f, 24f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 1.29f)
                lineTo(0.72f, 5.57f)
                lineTo(0.01f, 4.87f)
                lineTo(4.44f, 0.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                close()
            }
        }.also { _ArrowUpSmallBig = it}
