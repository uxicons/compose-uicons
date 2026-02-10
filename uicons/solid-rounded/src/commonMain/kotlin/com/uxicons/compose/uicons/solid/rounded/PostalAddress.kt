package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PostalAddress: ImageVector? = null

val Icons.Sr.PostalAddress: ImageVector
    get() = _PostalAddress ?: UXIcon(name = "PostalAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.62f, 15.04f)
                curveToRelative(0.12f, -0.02f, 0.25f, -0.04f, 0.38f, -0.04f)
                horizontalLineToRelative(8f)
                curveToRelative(0.13f, 0f, 0.26f, 0.01f, 0.38f, 0.04f)
                lineToRelative(-3.67f, 3.67f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                lineToRelative(-3.67f, -3.67f)
                close()
                moveTo(20.12f, 20.12f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.12f, -0.88f)
                lineToRelative(-3.76f, -3.76f)
                curveToRelative(-0.07f, 0.2f, -0.12f, 0.42f, -0.12f, 0.64f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.23f, -0.05f, -0.44f, -0.12f, -0.64f)
                lineToRelative(-3.76f, 3.76f)
                close()
                moveTo(17.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveTo(4.82f, 1.04f, 2.93f, 2.93f)
                curveTo(1.04f, 4.82f, 0f, 7.33f, 0f, 10f)
                reflectiveCurveToRelative(1.04f, 5.18f, 2.96f, 7.1f)
                lineToRelative(5.18f, 4.83f)
                curveToRelative(0.71f, 0.66f, 1.86f, 0.16f, 1.86f, -0.81f)
                verticalLineToRelative(-4.12f)
                curveToRelative(0f, -0.76f, 0.22f, -1.46f, 0.59f, -2.06f)
                curveToRelative(-0.2f, 0.02f, -0.39f, 0.06f, -0.59f, 0.06f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.13f, -0.39f, 2.16f, -1.03f, 3.0f)
                curveToRelative(0.01f, 0f, 0.02f, -0.0f, 0.03f, -0.0f)
                horizontalLineToRelative(5.54f)
                curveToRelative(0.3f, -0.96f, 0.46f, -1.97f, 0.46f, -3f)
                curveToRelative(0f, -2.67f, -1.04f, -5.18f, -2.93f, -7.07f)
                close()
                moveTo(10f, 7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _PostalAddress = it}
