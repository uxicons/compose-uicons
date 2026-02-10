package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PostalAddress: ImageVector? = null

val Icons.Ss.PostalAddress: ImageVector
    get() = _PostalAddress ?: UXIcon(name = "PostalAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16.24f)
                verticalLineToRelative(7.76f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-7.76f)
                lineToRelative(3.88f, 3.88f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(3.88f, -3.88f)
                close()
                moveTo(18.71f, 18.71f)
                lineToRelative(3.71f, -3.71f)
                horizontalLineToRelative(-8.83f)
                lineToRelative(3.71f, 3.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                close()
                moveTo(10f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(17.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                lineToRelative(-0.0f, 0.01f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-2.67f, 0f, -5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0f, 14.14f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.01f, 0.01f, 0.01f)
                lineToRelative(7.06f, 6.91f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-8.99f)
                curveToRelative(-2.75f, -0.0f, -5.0f, -2.24f, -5.0f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.13f, -0.39f, 2.16f, -1.03f, 3f)
                horizontalLineToRelative(5.56f)
                curveToRelative(1.08f, -3.44f, 0.26f, -7.35f, -2.46f, -10.07f)
                close()
            }
        }.also { _PostalAddress = it}
