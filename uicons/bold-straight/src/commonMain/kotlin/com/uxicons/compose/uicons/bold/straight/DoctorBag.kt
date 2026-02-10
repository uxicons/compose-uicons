package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoctorBag: ImageVector? = null

val Icons.Bs.DoctorBag: ImageVector
    get() = _DoctorBag ?: UXIcon(name = "DoctorBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21f, 6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-8f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(11f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _DoctorBag = it}
