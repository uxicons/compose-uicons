package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointOfSale: ImageVector? = null

val Icons.Bs.PointOfSale: ImageVector
    get() = _PointOfSale ?: UXIcon(name = "PointOfSale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                lineTo(7f, 9f)
                verticalLineToRelative(-4f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                lineTo(2f, 24f)
                lineTo(2f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                close()
                moveTo(17f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(12f)
                lineTo(17f, 3.5f)
                close()
            }
        }.also { _PointOfSale = it}
