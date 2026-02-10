package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Catalog: ImageVector? = null

val Icons.Rs.Catalog: ImageVector
    get() = _Catalog ?: UXIcon(name = "Catalog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.24f, 6f)
                lineToRelative(6.76f, -3.38f)
                verticalLineToRelative(3.38f)
                horizontalLineToRelative(-6.76f)
                close()
                moveTo(2f, 16f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10.76f)
                lineTo(5f, 6.38f)
                verticalLineToRelative(9.62f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(22f, 22f)
                lineTo(7f, 22f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _Catalog = it}
