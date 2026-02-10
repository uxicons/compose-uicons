package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Couch: ImageVector? = null

val Icons.Bs.Couch: ImageVector
    get() = _Couch ?: UXIcon(name = "Couch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 1f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 8f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                close()
                moveTo(21f, 18f)
                lineTo(3f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                lineTo(5f, 13f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.also { _Couch = it}
