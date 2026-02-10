package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownSmallBig: ImageVector? = null

val Icons.Ts.ArrowDownSmallBig: ImageVector
    get() = _ArrowDownSmallBig ?: UXIcon(name = "ArrowDownSmallBig") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.29f, 18.42f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.44f, 4.44f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineTo(0.01f, 19.13f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.28f, 4.28f)
                lineTo(5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(6f, 22.71f)
                lineToRelative(4.29f, -4.29f)
                close()
                moveTo(14f, 13f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(10f)
                lineTo(14f, 23f)
                lineTo(14f, 13f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(8f)
                lineTo(23f, 14f)
                lineTo(15f, 14f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 1f)
                lineTo(24f, 9f)
                horizontalLineToRelative(-8f)
                lineTo(16f, 1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(23f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(23f, 2f)
                close()
            }
        }.also { _ArrowDownSmallBig = it}
