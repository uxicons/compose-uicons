package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BallotCheck: ImageVector? = null

val Icons.Ss.BallotCheck: ImageVector
    get() = _BallotCheck ?: UXIcon(name = "BallotCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7.96f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(7.63f, 14f)
                curveToRelative(-0.43f, 0f, -0.85f, -0.16f, -1.18f, -0.49f)
                lineToRelative(-1.45f, -1.39f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.24f, 1.19f)
                lineToRelative(2.53f, -2.48f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.76f, 2.7f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.48f, -1.17f, 0.48f)
                close()
                moveTo(18f, 19f)
                horizontalLineToRelative(-8.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.04f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(-6.04f)
                lineToRelative(2.04f, -2f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 7f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BallotCheck = it}
