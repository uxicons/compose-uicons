package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QrcodeBox: ImageVector? = null

val Icons.Ss.QrcodeBox: ImageVector
    get() = _QrcodeBox ?: UXIcon(name = "QrcodeBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(18f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(24f, 13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11f, 11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(10f)
                close()
                moveTo(24f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _QrcodeBox = it}
