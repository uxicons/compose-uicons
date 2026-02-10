package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHardWork: ImageVector? = null

val Icons.Rs.UserHardWork: ImageVector
    get() = _UserHardWork ?: UXIcon(name = "UserHardWork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.57f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.57f, 4.88f, 1.57f, 3.5f)
                close()
                moveTo(3.07f, 17f)
                verticalLineToRelative(3f)
                lineToRelative(-1.0f, 4f)
                lineTo(0f, 24f)
                lineToRelative(1.1f, -4.38f)
                lineToRelative(-0.02f, -2.62f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5.12f)
                lineToRelative(3.1f, -2.86f)
                curveToRelative(0.79f, -2.4f, 3.04f, -4.14f, 5.7f, -4.14f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                curveToRelative(-2.95f, 0f, -5.41f, -2.14f, -5.9f, -4.95f)
                lineToRelative(-2.12f, 1.95f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.73f)
                lineToRelative(-2f, 1.39f)
                verticalLineToRelative(-3.11f)
                lineTo(3.07f, 17.0f)
                close()
                moveTo(13.99f, 6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(5.07f, 9f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(6.97f, 24f)
                horizontalLineToRelative(3.27f)
                lineToRelative(13.82f, -9.59f)
                verticalLineToRelative(-2.27f)
                lineTo(6.97f, 24f)
                close()
            }
        }.also { _UserHardWork = it}
