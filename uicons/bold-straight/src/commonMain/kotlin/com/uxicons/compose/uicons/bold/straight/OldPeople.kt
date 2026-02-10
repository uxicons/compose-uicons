package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OldPeople: ImageVector? = null

val Icons.Bs.OldPeople: ImageVector
    get() = _OldPeople ?: UXIcon(name = "OldPeople") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 13.07f)
                verticalLineToRelative(10.93f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 14.89f)
                curveToRelative(-0.96f, -0.56f, -1.86f, -1.23f, -2.68f, -1.97f)
                curveToRelative(-0.18f, 1.72f, -0.32f, 3.71f, -0.32f, 6.58f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.09f, -13.5f, 7.5f, -13.5f)
                curveToRelative(1.19f, 0.0f, 2.36f, 0.52f, 3.12f, 1.44f)
                horizontalLineToRelative(0f)
                curveToRelative(1.58f, 2.4f, 3.7f, 4.51f, 6.38f, 5.63f)
                close()
                moveTo(7.06f, 18f)
                horizontalLineToRelative(4.95f)
                curveToRelative(0.06f, -3.35f, 0.32f, -5.52f, 0.56f, -7.46f)
                curveToRelative(0.16f, -0.77f, -0.18f, -1.5f, -1.07f, -1.54f)
                curveToRelative(-3.12f, 0f, -4.19f, 5.64f, -4.44f, 9f)
                close()
            }
        }.also { _OldPeople = it}
