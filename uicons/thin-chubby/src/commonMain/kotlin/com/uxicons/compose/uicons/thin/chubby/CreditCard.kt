package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CreditCard: ImageVector? = null

val Icons.Tc.CreditCard: ImageVector
    get() = _CreditCard ?: UXIcon(name = "CreditCard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.16f, 5.46f)
                curveToRelative(-0.25f, -0.94f, -1.03f, -1.66f, -2.0f, -1.84f)
                curveToRelative(-5.26f, -0.97f, -11.06f, -0.97f, -16.32f, 0f)
                curveToRelative(-0.97f, 0.18f, -1.75f, 0.9f, -2.0f, 1.84f)
                curveToRelative(-1.11f, 4.22f, -1.11f, 8.86f, 0f, 13.08f)
                curveToRelative(0.25f, 0.94f, 1.03f, 1.66f, 2.0f, 1.84f)
                curveToRelative(2.63f, 0.48f, 5.4f, 0.72f, 8.16f, 0.72f)
                reflectiveCurveToRelative(5.53f, -0.24f, 8.16f, -0.72f)
                curveToRelative(0.97f, -0.18f, 1.75f, -0.9f, 2.0f, -1.84f)
                curveToRelative(1.11f, -4.22f, 1.11f, -8.86f, 0f, -13.08f)
                close()
                moveTo(2.8f, 5.71f)
                curveToRelative(0.15f, -0.57f, 0.63f, -1.0f, 1.22f, -1.11f)
                curveToRelative(2.57f, -0.47f, 5.28f, -0.71f, 7.98f, -0.71f)
                reflectiveCurveToRelative(5.41f, 0.24f, 7.98f, 0.71f)
                curveToRelative(0.59f, 0.11f, 1.07f, 0.55f, 1.22f, 1.11f)
                curveToRelative(0.16f, 0.62f, 0.3f, 1.25f, 0.41f, 1.89f)
                lineTo(2.39f, 7.6f)
                curveToRelative(0.11f, -0.64f, 0.25f, -1.27f, 0.41f, -1.89f)
                close()
                moveTo(21.2f, 18.29f)
                curveToRelative(-0.15f, 0.57f, -0.63f, 1.0f, -1.22f, 1.11f)
                curveToRelative(-5.15f, 0.94f, -10.82f, 0.94f, -15.96f, 0f)
                curveToRelative(-0.59f, -0.11f, -1.07f, -0.55f, -1.22f, -1.11f)
                curveToRelative(-0.82f, -3.11f, -1.01f, -6.46f, -0.57f, -9.69f)
                lineTo(21.77f, 8.6f)
                curveToRelative(0.44f, 3.22f, 0.25f, 6.58f, -0.57f, 9.69f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.41f, 12.35f)
                curveToRelative(-1.14f, 0f, -2.06f, 0.93f, -2.06f, 2.07f)
                reflectiveCurveToRelative(0.93f, 2.07f, 2.06f, 2.07f)
                reflectiveCurveToRelative(2.06f, -0.93f, 2.06f, -2.07f)
                reflectiveCurveToRelative(-0.93f, -2.07f, -2.06f, -2.07f)
                close()
                moveTo(7.41f, 15.49f)
                curveToRelative(-0.59f, 0f, -1.06f, -0.48f, -1.06f, -1.07f)
                reflectiveCurveToRelative(0.48f, -1.07f, 1.06f, -1.07f)
                reflectiveCurveToRelative(1.06f, 0.48f, 1.06f, 1.07f)
                reflectiveCurveToRelative(-0.48f, 1.07f, -1.06f, 1.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.15f, 13.99f)
                horizontalLineToRelative(-3.48f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.48f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _CreditCard = it}
