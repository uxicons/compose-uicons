package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserNurseHair: ImageVector? = null

val Icons.Ss.UserNurseHair: ImageVector
    get() = _UserNurseHair ?: UXIcon(name = "UserNurseHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 9f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-2.61f, 0f, -4.83f, -1.67f, -5.65f, -4f)
                horizontalLineToRelative(1.65f)
                curveToRelative(1.77f, 0f, 3.37f, -0.78f, 4.46f, -2f)
                close()
                moveTo(20.98f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-0.45f)
                lineToRelative(-3.53f, 4.02f)
                lineToRelative(-3.55f, -4.02f)
                horizontalLineToRelative(-0.45f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _UserNurseHair = it}
