package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSquareTriangle: ImageVector? = null

val Icons.Ts.ArrowUpSquareTriangle: ImageVector
    get() = _ArrowUpSquareTriangle ?: UXIcon(name = "ArrowUpSquareTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 1f)
                lineTo(14f, 1f)
                lineTo(14f, 10f)
                horizontalLineToRelative(9f)
                lineTo(23f, 1f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                close()
                moveTo(18.5f, 13.45f)
                lineToRelative(-5.18f, 9.55f)
                horizontalLineToRelative(10.35f)
                lineToRelative(-5.18f, -9.55f)
                close()
                moveTo(18.5f, 15.55f)
                lineToRelative(3.5f, 6.45f)
                horizontalLineToRelative(-6.99f)
                lineToRelative(3.5f, -6.45f)
                close()
                moveTo(7.59f, 0.44f)
                lineToRelative(4.72f, 4.72f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(6.99f, 1.25f)
                lineTo(6.99f, 23.98f)
                horizontalLineToRelative(-1f)
                lineTo(5.99f, 1.25f)
                lineTo(1.37f, 5.86f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(5.38f, 0.44f)
                curveToRelative(0.59f, -0.59f, 1.62f, -0.59f, 2.21f, 0f)
                close()
            }
        }.also { _ArrowUpSquareTriangle = it}
