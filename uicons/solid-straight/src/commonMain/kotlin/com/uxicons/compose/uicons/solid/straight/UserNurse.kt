package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserNurse: ImageVector? = null

val Icons.Ss.UserNurse: ImageVector
    get() = _UserNurse ?: UXIcon(name = "UserNurse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.45f)
                lineToRelative(3.55f, 4.02f)
                lineToRelative(3.53f, -4.02f)
                horizontalLineToRelative(0.45f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                close()
                moveTo(6f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(12f)
                lineTo(18f, 0f)
                lineTo(6f, 0f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(11f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(6.09f, 10f)
                curveToRelative(0.48f, 2.83f, 2.94f, 5f, 5.91f, 5f)
                reflectiveCurveToRelative(5.43f, -2.17f, 5.91f, -5f)
                lineTo(6.09f, 10f)
                close()
            }
        }.also { _UserNurse = it}
