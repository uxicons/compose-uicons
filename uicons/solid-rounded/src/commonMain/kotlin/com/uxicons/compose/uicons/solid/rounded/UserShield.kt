package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserShield: ImageVector? = null

val Icons.Sr.UserShield: ImageVector
    get() = _UserShield ?: UXIcon(name = "UserShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(18.5f, 24f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.45f, -0.1f)
                lineToRelative(-0.2f, -0.1f)
                curveToRelative(-1.14f, -0.57f, -4.85f, -2.7f, -4.85f, -6.27f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.85f)
                lineToRelative(3.13f, -1.04f)
                curveToRelative(0.2f, -0.07f, 0.43f, -0.07f, 0.63f, 0f)
                lineToRelative(3.13f, 1.04f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.85f)
                verticalLineToRelative(3.08f)
                curveToRelative(0f, 4.03f, -3.76f, 5.86f, -4.92f, 6.32f)
                lineToRelative(-0.21f, 0.08f)
                curveToRelative(-0.12f, 0.05f, -0.25f, 0.07f, -0.37f, 0.07f)
                close()
                moveTo(11f, 17.52f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0f, -0.56f, -0.37f, -1.06f, -0.91f, -1.2f)
                curveToRelative(-0.96f, -0.26f, -1.98f, -0.34f, -3.04f, -0.22f)
                curveTo(2.97f, 14.53f, 0f, 18.17f, 0f, 22.27f)
                verticalLineToRelative(0.73f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13.5f)
                curveToRelative(-1.69f, -1.36f, -3.5f, -3.51f, -3.5f, -6.48f)
                close()
            }
        }.also { _UserShield = it}
