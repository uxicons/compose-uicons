package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserNurseHair: ImageVector? = null

val Icons.Rs.UserNurseHair: ImageVector
    get() = _UserNurseHair ?: UXIcon(name = "UserNurseHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(16f, 9f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                curveToRelative(-1.86f, 0f, -3.41f, -1.28f, -3.86f, -3f)
                horizontalLineToRelative(0.3f)
                curveToRelative(1.56f, 0f, 3.25f, -0.86f, 4.32f, -2f)
                horizontalLineToRelative(3.24f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20.98f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.51f, -1.12f, -2.76f, -2.57f, -2.97f)
                lineToRelative(-4.4f, 5.02f)
                lineToRelative(-4.43f, -5.02f)
                curveToRelative(-1.45f, 0.21f, -2.58f, 1.46f, -2.58f, 2.97f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.45f)
                lineToRelative(3.55f, 4.02f)
                lineToRelative(3.53f, -4.02f)
                horizontalLineToRelative(0.45f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _UserNurseHair = it}
