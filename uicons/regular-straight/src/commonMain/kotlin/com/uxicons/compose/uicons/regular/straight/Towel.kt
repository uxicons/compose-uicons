package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Towel: ImageVector? = null

val Icons.Rs.Towel: ImageVector
    get() = _Towel ?: UXIcon(name = "Towel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 14f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-13.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-4f)
                close()
                moveTo(20f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10.34f)
                curveToRelative(-0.22f, 0.46f, -0.34f, 0.96f, -0.34f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-11f)
                close()
            }
        }.also { _Towel = it}
