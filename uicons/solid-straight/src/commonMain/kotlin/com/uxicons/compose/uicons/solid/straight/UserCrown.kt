package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCrown: ImageVector? = null

val Icons.Ss.UserCrown: ImageVector
    get() = _UserCrown ?: UXIcon(name = "UserCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(18f, 8f)
                lineTo(6f, 8f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(15f, 3f)
                lineToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
                lineTo(6f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(12f)
                lineTo(18f, 0f)
                lineToRelative(-3f, 3f)
                close()
            }
        }.also { _UserCrown = it}
