package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbidden: ImageVector? = null

val Icons.Tr.UserForbidden: ImageVector
    get() = _UserForbidden ?: UXIcon(name = "UserForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                lineToRelative(-6.68f, -6.68f)
                curveToRelative(1.51f, -0.58f, 2.57f, -2.05f, 2.57f, -3.72f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.67f, 0f, -3.14f, 1.06f, -3.72f, 2.57f)
                lineToRelative(-3.68f, -3.68f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                close()
                moveTo(9.08f, 8.37f)
                curveToRelative(0.29f, -1.36f, 1.51f, -2.37f, 2.92f, -2.37f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.41f, -1.01f, 2.63f, -2.37f, 2.92f)
                lineToRelative(-3.55f, -3.55f)
                close()
                moveTo(7f, 21.79f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0f, -2.6f, 1.95f, -4.75f, 4.54f, -4.98f)
                curveToRelative(0.28f, -0.03f, 0.48f, -0.27f, 0.45f, -0.54f)
                curveToRelative(-0.03f, -0.28f, -0.28f, -0.48f, -0.54f, -0.45f)
                curveToRelative(-3.11f, 0.28f, -5.46f, 2.85f, -5.46f, 5.98f)
                verticalLineToRelative(0.21f)
                curveToRelative(-3.01f, -1.97f, -5f, -5.36f, -5f, -9.21f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(15.52f, 15.52f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                curveToRelative(-1.8f, 0f, -3.5f, -0.44f, -5f, -1.21f)
                close()
            }
        }.also { _UserForbidden = it}
