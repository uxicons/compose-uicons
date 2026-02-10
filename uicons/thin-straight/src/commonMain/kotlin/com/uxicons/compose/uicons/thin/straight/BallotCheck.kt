package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BallotCheck: ImageVector? = null

val Icons.Ts.BallotCheck: ImageVector
    get() = _BallotCheck ?: UXIcon(name = "BallotCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.27f, 9.93f)
                lineToRelative(-3.79f, 3.73f)
                curveToRelative(-0.23f, 0.23f, -0.52f, 0.34f, -0.82f, 0.34f)
                reflectiveCurveToRelative(-0.6f, -0.11f, -0.83f, -0.34f)
                lineToRelative(-1.89f, -1.83f)
                lineToRelative(0.7f, -0.72f)
                lineToRelative(1.89f, 1.84f)
                curveToRelative(0.06f, 0.06f, 0.19f, 0.06f, 0.24f, 0.01f)
                lineToRelative(3.79f, -3.73f)
                lineToRelative(0.7f, 0.71f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1f)
                close()
                moveTo(6f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(2f, 24f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 2.5f)
                close()
                moveTo(12f, 12.55f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.98f)
                lineToRelative(-1.02f, 1f)
                close()
            }
        }.also { _BallotCheck = it}
