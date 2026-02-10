package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tree: ImageVector? = null

val Icons.Ts.Tree: ImageVector
    get() = _Tree ?: UXIcon(name = "Tree") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.45f, 21f)
                lineToRelative(-4.13f, -6f)
                horizontalLineToRelative(2.8f)
                lineToRelative(-4.29f, -6f)
                horizontalLineToRelative(3.2f)
                lineTo(13.64f, 0.86f)
                curveToRelative(-0.37f, -0.54f, -0.99f, -0.86f, -1.64f, -0.86f)
                reflectiveCurveToRelative(-1.27f, 0.32f, -1.65f, 0.87f)
                lineToRelative(-5.38f, 8.13f)
                horizontalLineToRelative(3.2f)
                lineToRelative(-4.29f, 6f)
                horizontalLineToRelative(2.8f)
                lineToRelative(-4.13f, 6f)
                horizontalLineToRelative(8.95f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.95f)
                close()
                moveTo(7.9f, 15f)
                horizontalLineToRelative(6.26f)
                lineToRelative(-0.69f, -1f)
                horizontalLineToRelative(-7.64f)
                lineToRelative(3.57f, -5f)
                horizontalLineToRelative(3.13f)
                lineToRelative(-0.71f, -1f)
                horizontalLineToRelative(-4.98f)
                lineTo(11.18f, 1.43f)
                curveToRelative(0.38f, -0.55f, 1.27f, -0.54f, 1.64f, -0.01f)
                lineToRelative(4.35f, 6.58f)
                horizontalLineToRelative(-3.28f)
                lineToRelative(4.29f, 6f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(4.13f, 6f)
                lineTo(4.45f, 20f)
                lineToRelative(3.45f, -5f)
                close()
            }
        }.also { _Tree = it}
