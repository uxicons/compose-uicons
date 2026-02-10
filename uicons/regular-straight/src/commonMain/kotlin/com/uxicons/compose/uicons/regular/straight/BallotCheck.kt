package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BallotCheck: ImageVector? = null

val Icons.Rs.BallotCheck: ImageVector
    get() = _BallotCheck ?: UXIcon(name = "BallotCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.6f, 10.82f)
                lineToRelative(-2.76f, 2.7f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.48f, -1.17f, 0.48f)
                curveToRelative(-0.43f, 0f, -0.85f, -0.16f, -1.18f, -0.49f)
                lineToRelative(-1.45f, -1.39f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.24f, 1.19f)
                lineToRelative(2.53f, -2.48f)
                lineToRelative(1.4f, 1.43f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 3f)
                verticalLineToRelative(21f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(16f)
                lineTo(20f, 3f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(-2.04f, 2f)
                close()
            }
        }.also { _BallotCheck = it}
