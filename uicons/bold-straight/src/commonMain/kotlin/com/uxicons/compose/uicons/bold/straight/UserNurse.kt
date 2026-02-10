package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserNurse: ImageVector? = null

val Icons.Bs.UserNurse: ImageVector
    get() = _UserNurse ?: UXIcon(name = "UserNurse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                lineTo(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(10f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                close()
                moveTo(21f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.02f, -0.63f, -1.91f, -1.54f, -2.29f)
                lineToRelative(-4.44f, 4.82f)
                lineToRelative(-4.47f, -4.83f)
                curveToRelative(-0.92f, 0.37f, -1.55f, 1.27f, -1.55f, 2.3f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.8f, 2.1f, -5.14f, 4.9f, -5.45f)
                lineToRelative(0.75f, -0.08f)
                lineToRelative(3.37f, 3.64f)
                lineToRelative(3.35f, -3.64f)
                lineToRelative(0.76f, 0.09f)
                curveToRelative(2.77f, 0.32f, 4.87f, 2.66f, 4.87f, 5.44f)
                close()
            }
        }.also { _UserNurse = it}
