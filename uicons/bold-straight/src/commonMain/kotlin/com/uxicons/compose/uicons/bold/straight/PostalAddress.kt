package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PostalAddress: ImageVector? = null

val Icons.Bs.PostalAddress: ImageVector
    get() = _PostalAddress ?: UXIcon(name = "PostalAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.05f, 14.95f)
                lineToRelative(4.95f, 4.84f)
                verticalLineToRelative(4.2f)
                lineToRelative(-7.06f, -6.9f)
                reflectiveCurveToRelative(-0.01f, -0.01f, -0.01f, -0.01f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-1.89f, -1.89f, -2.93f, -4.4f, -2.93f, -7.07f)
                reflectiveCurveTo(1.04f, 4.82f, 2.93f, 2.93f)
                reflectiveCurveTo(7.33f, 0f, 10f, 0f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                reflectiveCurveToRelative(2.93f, 4.4f, 2.93f, 7.07f)
                curveToRelative(0f, 1.03f, -0.16f, 2.04f, -0.46f, 3f)
                horizontalLineToRelative(-3.22f)
                curveToRelative(0.44f, -0.93f, 0.68f, -1.94f, 0.68f, -3f)
                curveToRelative(0f, -1.87f, -0.73f, -3.63f, -2.05f, -4.95f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                reflectiveCurveToRelative(-3.63f, 0.73f, -4.95f, 2.05f)
                curveToRelative(-1.32f, 1.32f, -2.05f, 3.08f, -2.05f, 4.95f)
                reflectiveCurveToRelative(0.73f, 3.63f, 2.05f, 4.95f)
                close()
                moveTo(20.12f, 20.12f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.12f, -0.88f)
                lineToRelative(-3.88f, -3.88f)
                verticalLineToRelative(7.76f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7.76f)
                lineToRelative(-3.88f, 3.88f)
                close()
                moveTo(17.29f, 18.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                lineToRelative(3.71f, -3.71f)
                horizontalLineToRelative(-8.83f)
                lineToRelative(3.71f, 3.71f)
                close()
                moveTo(13.06f, 9.98f)
                curveToRelative(0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.23f, 0f, -0.44f, 0.03f, -0.65f, 0.08f)
                curveToRelative(-1.37f, 0.27f, -2.41f, 1.49f, -2.41f, 2.94f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                curveToRelative(0.42f, 0f, 0.82f, -0.09f, 1.18f, -0.24f)
                curveToRelative(1.1f, -0.44f, 1.88f, -1.52f, 1.88f, -2.78f)
                close()
            }
        }.also { _PostalAddress = it}
