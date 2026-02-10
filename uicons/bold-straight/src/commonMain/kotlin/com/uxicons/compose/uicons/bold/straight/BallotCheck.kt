package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BallotCheck: ImageVector? = null

val Icons.Bs.BallotCheck: ImageVector
    get() = _BallotCheck ?: UXIcon(name = "BallotCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.95f, 10.67f)
                lineToRelative(-2.76f, 2.7f)
                curveToRelative(-0.41f, 0.42f, -0.96f, 0.62f, -1.52f, 0.62f)
                curveToRelative(-0.56f, 0f, -1.11f, -0.21f, -1.54f, -0.64f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.08f, -2.16f)
                lineToRelative(0.89f, 0.86f)
                lineToRelative(2.19f, -2.14f)
                lineToRelative(2.1f, 2.14f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(2f, 24f)
                lineTo(2f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(19f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(14f)
                lineTo(19f, 3.5f)
                close()
                moveTo(12.41f, 14f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.53f)
                lineToRelative(-3.06f, 3f)
                close()
            }
        }.also { _BallotCheck = it}
