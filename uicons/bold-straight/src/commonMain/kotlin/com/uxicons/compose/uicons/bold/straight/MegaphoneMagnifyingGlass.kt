package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MegaphoneMagnifyingGlass: ImageVector? = null

val Icons.Bs.MegaphoneMagnifyingGlass: ImageVector
    get() = _MegaphoneMagnifyingGlass ?: UXIcon(name = "MegaphoneMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 21.86f)
                lineToRelative(-5.68f, -5.68f)
                curveToRelative(1.35f, -1.7f, 2.16f, -3.85f, 2.16f, -6.18f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 4.49f, -10f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.1f, 0f, 4.05f, -0.65f, 5.66f, -1.76f)
                lineToRelative(5.75f, 5.75f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(14.46f, 10.91f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1f, -0.5f, -2f, -2f, -2f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(0.88f, 2f)
                curveToRelative(0.2f, 0.44f, 0.15f, 0.94f, -0.11f, 1.34f)
                reflectiveCurveToRelative(-0.7f, 0.64f, -1.18f, 0.64f)
                horizontalLineToRelative(-0.55f)
                lineToRelative(-1.91f, -4.69f)
                curveToRelative(-0.11f, -0.24f, -0.17f, -0.51f, -0.17f, -0.8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.5f, 0f, 2f, -1f, 2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.58f, 0.21f, 1f, 0.76f, 1f, 1.41f)
                reflectiveCurveToRelative(-0.42f, 1.2f, -1f, 1.41f)
                close()
            }
        }.also { _MegaphoneMagnifyingGlass = it}
