package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Catalog: ImageVector? = null

val Icons.Ss.Catalog: ImageVector
    get() = _Catalog ?: UXIcon(name = "Catalog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.47f, 5f)
                lineTo(19f, 0.15f)
                verticalLineToRelative(4.85f)
                horizontalLineToRelative(-9.53f)
                close()
                moveTo(4f, 5.54f)
                lineTo(14.88f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(4f)
                lineTo(4f, 5.54f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                lineTo(6f, 24f)
                lineTo(6f, 7f)
                horizontalLineToRelative(15f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Catalog = it}
