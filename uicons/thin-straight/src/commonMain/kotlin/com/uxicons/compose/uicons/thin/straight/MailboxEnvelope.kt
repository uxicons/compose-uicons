package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MailboxEnvelope: ImageVector? = null

val Icons.Ts.MailboxEnvelope: ImageVector
    get() = _MailboxEnvelope ?: UXIcon(name = "MailboxEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 15f)
                lineTo(2f, 15f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(2f, 16f)
                horizontalLineToRelative(8f)
                curveToRelative(0.18f, 0f, 0.34f, 0.06f, 0.48f, 0.14f)
                lineToRelative(-3.42f, 3.42f)
                curveToRelative(-0.56f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-3.42f, -3.42f)
                curveToRelative(0.14f, -0.08f, 0.3f, -0.14f, 0.48f, -0.14f)
                close()
                moveTo(11f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-5.96f)
                lineToRelative(3.23f, 3.23f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(3.23f, -3.23f)
                verticalLineToRelative(5.96f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9f)
                lineTo(23f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-8.69f)
                curveToRelative(1.62f, 1.08f, 2.69f, 2.91f, 2.69f, 5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(1f, 3.24f, 1f, 6f)
                verticalLineToRelative(7f)
                lineTo(0f, 13f)
                verticalLineToRelative(-7.19f)
                curveTo(0f, 2.6f, 2.6f, 0f, 5.81f, 0f)
                horizontalLineToRelative(12.19f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
                moveTo(19f, 11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(8f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _MailboxEnvelope = it}
